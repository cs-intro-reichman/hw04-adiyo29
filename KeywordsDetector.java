public class KeywordsDetector {
    public static void main(String[] args) {

        
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };

        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);

    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        int n = keywords.length;
        for (int x=0; x < sentences.length; x++){
            sentences[x] = lowerCase(sentences[x]);
        }
        for (int x=0; x < keywords.length; x++){
            keywords[x] = lowerCase(keywords[x]);
        }
        for (int i=0; i < n; i++){
            for (int x=0; x < sentences.length; x++){
                if(contains(sentences[x], keywords[i])) System.out.println(sentences[x]);
            }
        }

    }
      public static String lowerCase(String str) {
         String word = "";

            for (int i = 0; i < str.length(); i++){
            int a = str.charAt(i);
            if (64 < a && a < 91) a = a +32;
            word = word + (char) a;
            }
                    return word;
    }

    public static boolean contains(String str1, String str2) {
        String a = str1;
        String b = str2;
        if (a.indexOf(b) == -1) return false;
        else return true;        
        
    }

}


