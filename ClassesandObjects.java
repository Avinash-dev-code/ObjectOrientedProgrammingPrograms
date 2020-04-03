class Cat{

    String color,breed,name;
    int  legs;
    String eyes;
    public void Walk(){
        System.out.println("Cat is walking");
    

    }
    public void eat(){
          System.out.println("Cat is eating ");
    }
    public void Description(){
        System.out.println("My cat name is"+" "+name);
        System.out.println("My cat color is"+" "+color);
        System.out.println("My cat belongs to"+" "+breed+" "+"cat breed");
        System.out.println("My cat has"+" "+legs);
        System.out.println("My cat eyes are"+" "+eyes);

    }
}



class ClassesandObjects

{

    
    public static void main(String[] args) {
        Cat sammy=new Cat();
        sammy.name="sammy";
        sammy.color="White";
        sammy.breed="Persian";
        sammy.legs=4;
        sammy.eyes="Brownish";
        sammy.Description();

    


        
    }

}