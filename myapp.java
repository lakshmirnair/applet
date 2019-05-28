import java.awt.*;
import java.applet.*;
import java.awt.event.*;


 public  class myapp extends Applet  implements  ActionListener 
{
	
	
	Image i;
	Button  b;
	Button  b1;
	prime ps;
	Label  l1=new Label ("hello");
	Label  l2=new Label ("asd");
	Font cf=new Font("TimesRoman",Font.ITALIC,50);
	Font cf1=new Font("TimesRoman",Font.ITALIC,30);
	Font c=new Font("Courier",Font.BOLD,50);
	public void init()
	
	{  
		
	  b=new Button("START");
	  b1=new Button("EXIT");
		
		
		i=getImage(getDocumentBase(),"file:///C:/Users/DELL/16055/appproject/src/pics/quiz-characters.png");
				
		
		add(l1);
		add(l2);
		add(b);
		add(b1);
		b.addActionListener(this);
		b1.addActionListener(this);
		 ps=new prime(); 
		
		
	}
	public void paint(Graphics g)
	{ 
		l1.setText(" Test yourself ");
	l1.setFont(cf);
	l1.setForeground(Color.red);
	
	l2.setText(" Have fun ");
	l2.setFont(cf);
	l2.setForeground(Color.red);

		g.drawImage(i,363,194,1465,740,this);
		
		
		b.setLocation(400,600);
        b.setFont(cf1);
		b.setForeground(Color.blue);
		b.setSize(130,50);
		
		
		
		b1.setLocation(400,650);
        b1.setFont(cf1);
		b1.setForeground(Color.blue);
		b1.setSize(130,50);
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == b)
		{   
		   
		add(ps);	
	    ps.init();
	   // ps.start();
		    
		    
		    
	/*b.setVisible(false);	
			b1.setVisible(false);
			primerun pr=new primerun();
			add(pr);
			pr.init();*/
			
		}
	if (event.getSource() == b1)
			System.exit(0);
		
	}
	
	
}


