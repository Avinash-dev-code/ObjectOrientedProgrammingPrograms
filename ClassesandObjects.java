class Cat{
    String color,breed;
    int  legs,eyes;
    public void Walk(){
        System.out.println("My cat color has"+" "+color);
    

    }
    public void eat(){
          System.out.println("Cat is eating");
    }
}



class ClassesandObjects

{

    
    public static void main(String[] args) {
        Cat rangerover=new Cat();
        rangerover.color="red";
        rangerover.breed="husky";
        rangerover.Walk();
        rangerover.eat();

    


        
    }

}