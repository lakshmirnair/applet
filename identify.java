
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.JLabel;


public class identify extends Applet implements ActionListener   {  
	  
	  Image p1,p2,p3,p4,p5,p6,p7;  
	  Button b1,b2;
	  TextField t1,t2,t3,t4,t5,t6,t7,t8;
	  String s1,s2,s3,s4,s5,s6,s7;
	   int count=0;
	   String str;
	   Font f1=new Font("TimesRoman",Font.ITALIC,50);
	   Label  l1=new Label ("lak"); 
	   Button sub=new Button("submit");
	   Font f2=new Font("Courier",Font.BOLD,22);
	   public void init()
	   {
		   p1=getImage(getDocumentBase(),"file:///C:/Users/DELL/16055/appproject/src/pics/im2.jpg");
		   p2=getImage(getDocumentBase(), "file:///C:/Users/DELL/16055/appproject/src/pics/im9.jpg");
		   
		   p3=getImage(getDocumentBase(),"file:///C:/Users/DELL/16055/appproject/src/pics/im6.jpg");
		   p4=getImage(getDocumentBase(),"file:///C:/Users/DELL/16055/appproject/src/pics/1m8.jpg");
		   p5=getImage(getDocumentBase(),"file:///C:/Users/DELL/16055/appproject/src/pics/im7.jpg");
			p6=getImage(getDocumentBase(),"file:///C:/Users/DELL/16055/appproject/src/pics/im4.png");
			p7=getImage(getDocumentBase(),"file:///C:/Users/DELL/16055/appproject/src/pics/taj.jpg");	
			
			
			
			t1 = new TextField(13);
			add(t1);
			t2 = new TextField(13);
			add(t2);
			t3= new TextField(13);
			add(t3);
			t4= new TextField(13);
			add(t4);
			t5 = new TextField(13);
			add(t5);
			t6= new TextField(13);
			add(t6);
			t7= new TextField(13);
			add(t7);
			
			t8= new TextField("0",10);
			add(t8);
			
			add(l1);
			add(sub);
			sub.addActionListener(this);	   
	   }
	   
	   public void paint(Graphics g)
	   {
		   setBackground(Color.black);
		   
		   l1.setText(" A journey around the world ");
			l1.setFont(f1);
			l1.setForeground(Color.blue );
			
			 g.drawImage(p1, 50,120, 250, 250, this); 
			 t1.setLocation(50,380);
		       t1.setFont(f2);
				t1.setSize(250,25);
				
			 
				g.drawImage(p2, 450,120, 250, 250, this); 
				 t2.setLocation(450,380);
				  t2.setFont(f2);
					t2.setSize(250,25);
			 
			 
					 g.drawImage(p3, 925,120, 250, 250, this); 
					 t3.setLocation(925,380);
					  t3.setFont(f2);
						t3.setSize(250,25);			
				 	
						
						
						 g.drawImage(p4, 1400,120, 250, 250, this); 
						 t4.setLocation(1400,380);
						  t4.setFont(f2);
							t4.setSize(250,25);
					 	
					 			
							 g.drawImage(p5, 170,500, 250, 250, this); 
							 t5.setLocation(170,780);
							  t5.setFont(f2);
								t5.setSize(250,25);				
						 
								
								 g.drawImage(p6, 650,500, 250, 250, this); 
								 t6.setLocation(650,780);
								  t6.setFont(f2);
									t6.setSize(250,25);							
					
									
									 g.drawImage(p7, 1100,500, 300, 225, this); 
									 t7.setLocation(1100,780);
									  t7.setFont(f2);
										t7.setSize(300,25);
										
										
										 t8.setLocation(1464,757);
										  t8.setFont(f2);	
										 
										
										
										
									   
									    	  				
		   
	   }

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if(arg0.getSource()==sub) {
		
	    System.out.println("fgh");
	      if(t1.getText().equalsIgnoreCase("colosseum"))
	      { ++count;
	       str=String.valueOf(count);
		  t8.setText(str);
		 
	      
	      
	      }
	      if(t2.getText().equalsIgnoreCase("sydney operahouse"))
	      {
	    	  
	    	  ++count;
	    	  
	    	   str=String.valueOf(count);
			  t8.setText(str);
			 
	      }
	    	  
	      if(t3.getText().equalsIgnoreCase("mount rushmore"))
	      {
	    	 ++count;
	    	  str=String.valueOf(count);
			  t8.setText(str);
			 
	      }
	    	
	      if(t4.getText().equalsIgnoreCase("eiffel tower"))
	      {
	    	 
	    	  ++count;
	    	   str=String.valueOf(count);
			  t8.setText(str);
			  
	      }
	    	  					
	      if(t5.getText().equalsIgnoreCase("oriental pearltower"))
	      {
	    	  
	    	 ++count;
	    	  str=String.valueOf(count);
			  t8.setText(str);
			  
	      }
	    	 
	      if(t6.getText().equalsIgnoreCase("london bridge"))
	      {
	    	  
	    	  ++count;
	    	  
	    	   str=String.valueOf(count);
			  t8.setText(str);
			  
	      }
	    	 
	      if(t7.getText().equalsIgnoreCase("tajmahal"))
	      {++count;
	    	  System.out.println(count);
	    	
	    	  t8.setText(Integer.toString(count));
			 
	      }
	      
	   
	    	  				
}
}
	// TODO Auto-generated method stub
		
	}
	   

