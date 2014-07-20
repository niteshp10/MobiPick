class Tablet
{     
  public static void main(String args[])
  {
    Specification[] apple= new Specification[5];
    Specification[] samsung= new Specification[5];
    Specification[] micromax= new Specification[5];
    Specification[] sony= new Specification[5];
    Specification[] nokia= new Specification[5];
    
    apple[1]=new Specification("Apple iPad",9.7,3500,5.2,"3 GHz dual core",28999);
    apple[3]=new Specification("Apple iPad mini",7.0,3050,5.0,"2.3 GHz dual core",24050);
    apple[2]=new Specification("Apple iPad air",9.0,2800,8.0,"A6 Chip x64 architecture",34999);
    
    samsung[0]=new Specification("Samsung Tab 1 ",7.3,1500,3.2,"1 GHz dual core",11999);
    samsung[1]=new Specification("Samsung Tab 2 ",7.0,2500,8.0,"2.5 GHz quad core",18990);
    samsung[2]=new Specification("Samsung Tab 3 ",8.3,3500,16.0,"2.7 GHz quad + quad core",34950);
    samsung[3]=new Specification("Samsung Tab 4",10.0,4000,16,"2 GHz quad+quad core",43999);
    
    micromax[0]=new Specification("Micromax Play ",7.2,2000,8.0,"1.3 GHz quad core",19990);
    micromax[1]=new Specification("Micromax Play HD ",7.3,2300,12.0,"1.5 GHz quad core",28940);
    micromax[2]=new Specification("Micromax Play me ",8.0,2350,16.1,"1.7 GHz quad core",21700);
    micromax[3]=new Specification("Micromax Play U ",7.7,3250,16.1,"2.3 GHz quad core",32700);
    
    sony[0]=new Specification("Sony Z Tab",8.0,2500,5.0,"2.3 GHz quad core",36500);
    sony[1]=new Specification("Sony Z Tab Ultra",10.5,3100,8.0,"1.4 GHz quad core",39500);
   
    
    nokia[0]=new Specification("Nokia Slate",9.0,3600,5.2,"3.0 GHz dual core Snapdragon qualcomm",37800);
    

    
    for(int i=0;i<110;i++)
	System.out.print("-");
    System.out.println("\n\t\t\t\t\t\t\tTab Pick");
    for(int i=0;i<110;i++)
	System.out.print("-");
    System.out.println("\n\n\t\t\t\t\t\t Please enter your choice(1 or 2) : \n \t\t\t\t\t\t\t1. Price \n \t\t\t\t\t\t\t2. Company ");
    int choice = StdIn.readInt();
    
    for(int i=0;i<110;i++)
	System.out.print("-");
	
    switch(choice)
    {
      case 1: 
      {
	System.out.println("\n\n\t\t\t\t\t\t Please select your range : \n\t\t\t\t\t\t\t 1. 10,000 - 20,000 \n\t\t\t\t\t\t\t 2. 20,000 and above ");
	int key = StdIn.readInt();
	
	for(int i=0;i<110;i++)
	System.out.print("-");
	
	 if(key==1)
	{
	  samsung[0].show();
	  samsung[1].show();
	  micromax[0].show();
	  
	}
	else if(key==2)
	{
	  apple[1].show();
	  apple[2].show();
	  apple[3].show();
	  samsung[2].show();
	  samsung[3].show();
	  micromax[1].show();
	  micromax[2].show();
	  micromax[3].show();
	  sony[0].show();
	  sony[1].show();
	  nokia[0].show();
	}
	else
	System.out.println("\t\t\t\t\t\t\tInvalid entry");
	
	for(int i=0;i<110;i++)
	System.out.print("-");
	
      }
      break;
      case 2 : 
      {
	System.out.println("\n\n\t\t\t\t\t\t Please select company : \n\t\t\t\t\t\t\t 1. Apple  \n\t\t\t\t\t\t\t 2. Samsung \n\t\t\t\t\t\t\t 3. Micromax \n\t\t\t\t\t\t\t 4. Sony \n\t\t\t\t\t\t\t 5. Nokia ");
	int k = StdIn.readInt();
	
	for(int i=0;i<110;i++)
	System.out.print("-");
	
	if(k==1)
	{
	  for(int i=1;i<=3;i++)
	    apple[i].show();
	}
	else if(k==2)
	{
	  for(int i=0;i<=3;i++)
	    samsung[i].show();
	}
	else if(k==3)
	{
	  for(int i=0;i<4;i++)
	    micromax[i].show();
	}
	else if(k==4)
	{
	  for(int i=0;i<2;i++)
	    sony[i].show();
	}
	else if(k==5)
	{
	  for(int i=0;i<1;i++)
	    nokia[i].show();
	}
	else
	System.out.println("\t\t\t\t\t\t\tInvalid entry");
	
	for(int i=0;i<110;i++)
	System.out.print("-");
	
      }
      break;
      default: System.out.println("\t\t\t\t\t\t\tInvalid entry");
      for(int i=0;i<110;i++)
	System.out.print("-");
    }
  }
  
}