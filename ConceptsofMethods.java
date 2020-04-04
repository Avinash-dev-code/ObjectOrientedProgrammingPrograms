class ConceptsofMethods{
    public static void main(String[] args) {
       int c=344;
       int f=34535;
       int result=maxOf(c, f);

       System.out.println(result);
        int a=35;
        int b=67;
        swap(a,b);
        System.out.println(a+" "+b);

    }
    public static int maxOf(int a,int b) {
             if(a>b){
                 return a;
             }
             else
             {
                 return b;
             }
    
        
    }
    static void swap(int a,int b){
                int temp=a;
                a=b;
                b=temp;
                

    }

}
