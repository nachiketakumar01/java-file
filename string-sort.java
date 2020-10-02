public class Sort_strings
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
         n=args.length;
        
        
        
        String str[] = new String[n];
        
        
       
      
        for(int i = 0; i < n; i++)
        {
            str[i] = args[i];
        }
        
       
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
       
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= n - 1; i++) 
        {
            System.out.print(str[i] + ", ");
        }
    }
}
