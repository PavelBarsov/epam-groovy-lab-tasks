/**
Define, whether input string have a Ip format. Example:
Task05.isSublist("10.0.152.164") == true
*/

package groovylab

class Task05 {
public static boolean isIp(String ip)
{
    try
    {
         String[] parts = ip.split("\\.");
         if (parts.length != 4) return false;
         for (int i = 0; i < 4; ++i)
         {
             int p = Integer.parseInt(parts[i]);
             if (p > 255 || p < 0) return false;
         }
         return true;
    } catch (Exception e)
    {
        return false;
    }
}
}
