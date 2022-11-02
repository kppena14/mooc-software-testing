package tudelft.mirror;

public class Mirror
{

    public String mirrorEnds(String string)
    {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;
        for (int i = 0; i < string.length(); i++, begin++, end--)
        {
            if (string.charAt(begin) == string.charAt(end))
            {
                mirror += String.valueOf(string.charAt(end));
            }
            else
            {
                break;
            }
        }

        return mirror;
    }
}
