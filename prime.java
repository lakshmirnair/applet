
import java.applet.*;
import java.awt.*;

import java.awt.event.*;

 public  class prime extends Applet  implements  ActionListener 
{
	 
	boolean		isPrime = true;
	long		testedValue = 2;
	long		divisor = 1;
	TextField	t;
	Image im;
	Button b=new Button("CHECK");
	Button b1=new Button("NEXT");
	Button b2=new Button("EXIT");
	
	
	Label  l1=new Label ("he");  
	Label  l2=new Label ("iio");
	Font f=new Font("Courier",Font.BOLD,20);
	Font f2=new Font("Courier",Font.BOLD,22);
	Font f1=new Font("TimesRoman",Font.ITALIC,50);
	Font f3=new Font("TimesRoman",Font.ITALIC,30);
	
	public void init()
	{   setLayout(new FlowLayout());
		im=getImage(getDocumentBase(),"file:///C:/Users/DELL/16055/appproject/src/pics/lak.jpg");
		
		t = new TextField("2",19);
		
		add(l2);
		add(l1);
		add(t);
		add(b);
		b.addActionListener(this);
		add(b1);
		b1.addActionListener(this);
		add(b2);
		b2.addActionListener(this);
		//resize(1550, 900);
	}
	
	
	
    public void paint(Graphics g)
    {
    	
    	l2.setText(" Wonder in Maths World ");
    	l2.setFont(f1);
    	l2.setForeground(Color.blue);
    	
    	
    	g.drawImage(im,200,120,1500,900,this);
    	
    	
    	l1.setLocation(900,390);
    	l1.setText("Enter a number ");
    	l1.setFont(f);
    	l1.setForeground(Color.black);
    	
    	
    	b.setLocation(1073,418);
        b.setFont(f);
		b.setForeground(Color.black);
		b.setSize(100,50);
		
		
		//resize(1550, 900);
		b1.setLocation(1600,680);
        b1.setFont(f3);
		b1.setForeground(Color.blue);
		b1.setSize(130,50);
		
		b2.setLocation(1600,735);
        b2.setFont(f3);
		b2.setForeground(Color.blue);
		b2.setSize(130,50);
		
		
		
		
		
		t.setLocation(712,418);
        t.setFont(f);
		t.setForeground(Color.green);
		t.setSize(100,50);
		
    	
    	g.clearRect(750, 603, 200, 80);
    	
        
        if ( isPrime )
        {
        	
        	g.setFont(f2);
       		g.drawString("" + testedValue + " is prime", 750, 600);
        }
       	else
       	{
       		
       		g.setFont(f2);
       		g.drawString("" + testedValue + " is divisible by " + divisor, 750, 600);
       	
       	}
    }

	// Procedures specific to Primes
	
	public void DoTest()
	{
		String	numString;
		long	testPrime;
		
		numString = t.getText();
		testPrime = Long.parseLong(numString);
		
		if ( testPrime < 2 )
			return /* nothing */ ;
			
		divisor = IsPrime(testPrime);
    	if ( divisor == testPrime )
			isPrime = true;
    	else
    		isPrime = false;

		testedValue = testPrime;
		
		repaint();
    }
    
    public long IsPrime(long testPrime)
    {
    	long	test;
    	
    	// should at least use square root
    	test = 2;
    	while ( test < testPrime )
    	{
    		if ( testPrime % test == 0 )
    			return test;
    		
    		if ( test == 2 )
	    		test++;
	    	else
	    		test += 2;
    	}
    	
        return testPrime;
    }
    
    
    public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
    	if (event.getSource() == b)
    		DoTest();
		
    			
    	if (event.getSource() == b1)
    		  b1.setVisible(true);
    	
    	if (event.getSource() == b2)
    			System.exit(0);
	
		
	}
}


