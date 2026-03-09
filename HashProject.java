
public class HashProject
{

    public static void main(String[] args)
    {
        LinearProbingHashST<String, Integer> st = new LinearProbingHashST<>();

        String str = "Aaliyah";
        for (int i = 0; i < str.length(); i++)
        {
            String key = str.substring(i, i + 1);
            st.put(key, i);
            st.print();

        }

    }
}

