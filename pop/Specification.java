class Specification
  {
   private String name;
   private double screenSize;
   private int battery;
   private double camera;
   private String processor;
   private int price;
   
    Specification(String n,double scr,int b,double c,String p,int budget)
    {
    name = n;
    screenSize = scr;
    battery = b;
    camera = c;
    processor = p;
    price=budget;
    //System.out.println(" Name :"+name+"\n\n Screen size : "+screenSize+" inches \n\n Battery : "+battery+" mAh \n\n Camera : "+camera+"MP \n\n Processor : "+processor+"\n\n Price : Rs "+price);
    }
    void show()
    {
      System.out.print("\n");
      setwidth(140);
      System.out.print("\n");
      displayTabs(7);
      System.out.print("Name\t         :	" +name+"\n");
      displayTabs(7);
      System.out.print("Screen size\t :	" + screenSize+" inches\n");
      displayTabs(7);
      System.out.print("Battery\t\t :	"+battery+" mAh \n"); 
      displayTabs(7);
      System.out.print("Camera\t         : 	"+camera+" MP \n"); 
      displayTabs(7);
      System.out.print("Processor 	 :	"+processor+"\n"); 
      displayTabs(7);
      System.out.print("Price\t         : 	Rs "+price+"\n");
    }
    
    void setwidth(int x)
    {
      for(int i=0;i<x;i++)
	System.out.print("-");
	
    }
    
    void displayTabs(int x)
    {
      for(int i=0;i<x;i++)
	System.out.print("\t");
	
    }
    
   
}