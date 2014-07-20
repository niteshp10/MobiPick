class Display
{     
  public static void main(String args[])
  {
    Specification[] apple= new Specification[5];
    Specification[] samsung= new Specification[5];
    Specification[] micromax= new Specification[5];
    Specification[] sony= new Specification[5];
    Specification[] nokia= new Specification[5];
    
    apple[1]=new Specification("Apple iPhone 3S",3.7,1500,3.2,"1 GHz dual core",18999);
    apple[3]=new Specification("Apple iPhone 4S",3.9,1750,5.0,"1.3 GHz dual core",24450);
    apple[2]=new Specification("Apple iPhone 5S",4.0,1800,8.0,"A7 Chip x64 architecture",44999);
    
    samsung[0]=new Specification("Samsung Galaxy Y duos ",4.3,1500,3.2,"1 GHz dual core",8999);
    samsung[1]=new Specification("Samsung Grand ",5.0,2000,8.0,"1.5 GHz quad core",18990);
    samsung[2]=new Specification("Samsung Grand ",5.3,3500,16.0,"1.7 GHz quad + quad core",24950);
    samsung[3]=new Specification("Samsung Galaxy S5",5.2,4000,16,"2 GHz quad+quad core",43999);
    
    micromax[0]=new Specification("Micromax Canvas 2 ",5.0,2000,8.0,"1.3 GHz quad core",9990);
    micromax[1]=new Specification("Micromax Canvas Turbo ",5.3,2100,12.0,"1.5 GHz quad core",18940);
    micromax[2]=new Specification("Micromax Canvas Knight ",5.0,2350,16.1,"1.7 GHz quad core",21700);
    micromax[3]=new Specification("Micromax Canvas HD ",5.2,3350,16.1,"2.3 GHz quad core",32700);
    
    sony[0]=new Specification("Sony Xperia E",4.0,1500,5.0,"1.0 GHz dual core",7500);
    sony[1]=new Specification("Sony Xperia L",4.5,2100,8.0,"1.4 GHz quad core",14500);
    sony[2]=new Specification("Sony Xperia Z1",5.4,3750,21.0,"1.8 GHz octa core",27590);
    sony[3]=new Specification("Sony Xperia SL",4.4,3050,15.0,"2.4 GHz quad core",21590);
    
    nokia[0]=new Specification("Nokia lumia 520",4.0,1600,5.2,"1.0 GHz dual core Snapdragon qualcomm",7800);
    nokia[1]=new Specification("Nokia lumia 720",4.7,2000,6.7,"1.2 GHz dual core Snapdragon qualcomm",16899);
    nokia[2]=new Specification("Nokia lumia 1020",5.3,4000,41.0,"1.6 GHz quad core Snapdragon qualcomm",38850);
    nokia[3]=new Specification("Nokia lumia 1520",5.7,3500,12.0,"1.7 GHz dual core Snapdragon qualcomm",24850);
 
    for(int i=0;i<140;i++)
	System.out.print("-");
	
    System.out.println("\n\t\t\t\t\t\t\t\tCellPick");
    for(int i=0;i<140;i++)
	System.out.print("-");
	
    System.out.println("\n\n\t\t\t\t\t\t Please enter your choice(1 or 2) : \n \t\t\t\t\t\t\t\t1. Price \n \t\t\t\t\t\t\t\t2. Company "); 
    System.out.println("\n\t\t\t\t\t\t\t\t");
    int choice = StdIn.readInt();
    for(int i=0;i<140;i++)
	System.out.print("-");
    
    switch(choice)
    {
      case 1: 
      {
	System.out.println("\n\n\t\t\t\t\t\t Please select your range : \n\t\t\t\t\t\t\t\t 1. 0 - 10,000 \n\t\t\t\t\t\t\t\t 2. 10,000 - 20,000 \n\t\t\t\t\t\t\t\t 3. 20,000 and above ");
	System.out.println("\n\t\t\t\t\t\t\t\t");
	int key = StdIn.readInt();
	
	for(int i=0;i<140;i++)
	System.out.print("-");
	
	if(key==1)
	{
	  samsung[0].show();
	  micromax[0].show();
	  sony[0].show();
	  nokia[0].show();
	}
	else if(key==2)
	{
	  apple[1].show();
	  samsung[1].show();
	  micromax[1].show();
	  sony[1].show();
	  nokia[1].show();
	}
	else if(key==3)
	{
	  apple[2].show();
	  samsung[2].show();
	  micromax[2].show();
	  sony[2].show();
	  nokia[2].show();
	  apple[3].show();
	  samsung[3].show();
	  micromax[3].show();
	  sony[3].show();
	  nokia[3].show();
	}
	else
	System.out.println("\t\t\t\t\t\tINVALID CHOICE !!!");
      }
      break;
      case 2 : 
      {
	System.out.println("\n\n\t\t\t\t\t\t Please select company : \n\t\t\t\t\t\t\t\t 1. Apple  \n\t\t\t\t\t\t\t\t 2. Samsung \n\t\t\t\t\t\t\t\t 3. Micromax \n\t\t\t\t\t\t\t\t 4. Sony \n\t\t\t\t\t\t\t\t 5. Nokia ");
	System.out.println("\n\t\t\t\t\t\t\t\t");
	int k = StdIn.readInt();
	
	for(int i=0;i<140;i++)
	  System.out.print("-");
	
	if(k==1)
	{
	  for(int i=1;i<4;i++)
	    apple[i].show();
	}
	else if(k==2)
	{
	  for(int i=0;i<4;i++)
	    samsung[i].show();
	}
	else if(k==3)
	{
	  for(int i=0;i<4;i++)
	    micromax[i].show();
	}
	else if(k==4)
	{
	  for(int i=0;i<4;i++)
	    sony[i].show();
	}
	else if(k==5)
	{
	  for(int i=0;i<4;i++)
	    nokia[i].show();
	}
	else
	System.out.println("\t\t\t\t\t\tINVALID CHOICE !!!");
      }
      break;
      default: System.out.println("\t\t\t\t\t\tINVALID CHOICE !!!");
    }
  }
  
}