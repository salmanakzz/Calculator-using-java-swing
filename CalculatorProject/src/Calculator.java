import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	int operation;
	String oldValue;
	String oldValue2;
	String oldValue3;
	String oldValue4;
		
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(340,600);
		jf.setLocation(460,100);
		jf.getContentPane().setBackground(Color.BLACK);
		
		ImageIcon img = new ImageIcon(".\\src\\java.png");
	    jf.setIconImage(img.getImage());
		

		
		displayLabel=new JLabel();
		displayLabel.setBounds(10,50,302,60);
		displayLabel.setBackground(Color.BLACK);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arial", Font.PLAIN, 70));		
		jf.add(displayLabel);
		
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(10,130,70,80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sevenButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		sevenButton.setBackground(Color.decode("#1C1C1C"));
		sevenButton.setForeground(Color.WHITE);
		sevenButton.setOpaque(true);
	    sevenButton.setFocusPainted(false);
	    sevenButton.setBorderPainted(false);
	   
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(85,130,70,80);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		eightButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		eightButton.setBackground(Color.decode("#1C1C1C"));
		eightButton.setForeground(Color.WHITE);
		eightButton.setOpaque(true);
	    eightButton.setFocusPainted(false);
	    eightButton.setBorderPainted(false);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(160,130,70,80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		nineButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		nineButton.setBackground(Color.decode("#1C1C1C"));
		nineButton.setForeground(Color.WHITE);
		nineButton.setOpaque(true);
	    nineButton.setFocusPainted(false);
	    nineButton.setBorderPainted(false);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(10,220,70,80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fourButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		fourButton.setBackground(Color.decode("#1C1C1C"));
		fourButton.setForeground(Color.WHITE);
		fourButton.setOpaque(true);
	    fourButton.setFocusPainted(false);
	    fourButton.setBorderPainted(false);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(85,220,70,80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fiveButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		fiveButton.setBackground(Color.decode("#1C1C1C"));
		fiveButton.setForeground(Color.WHITE);
		fiveButton.setOpaque(true);
	    fiveButton.setFocusPainted(false);
	    fiveButton.setBorderPainted(false);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(160,220,70,80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sixButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		sixButton.setBackground(Color.decode("#1C1C1C"));
		sixButton.setForeground(Color.WHITE);
		sixButton.setOpaque(true);
	    sixButton.setFocusPainted(false);
	    sixButton.setBorderPainted(false);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(10,310,70,80);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		oneButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		oneButton.setBackground(Color.decode("#1C1C1C"));
		oneButton.setForeground(Color.WHITE);
		oneButton.setOpaque(true);
	    oneButton.setFocusPainted(false);
	    oneButton.setBorderPainted(false);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(85,310,70,80);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		twoButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		twoButton.setBackground(Color.decode("#1C1C1C"));
		twoButton.setForeground(Color.WHITE);
		twoButton.setOpaque(true);
	    twoButton.setFocusPainted(false);
	    twoButton.setBorderPainted(false);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(160,310,70,80);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		threeButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		threeButton.setBackground(Color.decode("#1C1C1C"));
		threeButton.setForeground(Color.WHITE);
		threeButton.setOpaque(true);
	    threeButton.setFocusPainted(false);
	    threeButton.setBorderPainted(false);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(10,400,70,80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		dotButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		dotButton.setBackground(Color.decode("#1C1C1C"));
		dotButton.setForeground(Color.WHITE);
		dotButton.setOpaque(true);
	    dotButton.setFocusPainted(false);
	    dotButton.setBorderPainted(false);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(85,400,70,80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		zeroButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		zeroButton.setBackground(Color.decode("#1C1C1C"));
		zeroButton.setForeground(Color.WHITE);
		zeroButton.setOpaque(true);
	    zeroButton.setFocusPainted(false);
	    zeroButton.setBorderPainted(false);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(160,400,70,80);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
		equalButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		equalButton.setBackground(Color.decode("#0a4f84"));
		equalButton.setForeground(Color.WHITE);
		equalButton.setOpaque(true);
	    equalButton.setFocusPainted(false);
	    equalButton.setBorderPainted(false);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(237,130,75,80);
		divButton.setFont(new Font("Arial", Font.PLAIN, 30));
		divButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		divButton.setBackground(Color.decode("#bdbdbd"));
		divButton.setForeground(Color.BLACK);
		divButton.setOpaque(true);
	    divButton.setFocusPainted(false);
	    divButton.setBorderPainted(false);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton=new JButton("*");
		mulButton.setBounds(237,220,75,80);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 30));
		mulButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		mulButton.setBackground(Color.decode("#bdbdbd"));
		mulButton.setForeground(Color.BLACK);
		mulButton.setOpaque(true);
	    mulButton.setFocusPainted(false);
	    mulButton.setBorderPainted(false);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(237,310,75,80);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 30));
		minusButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		minusButton.setBackground(Color.decode("#bdbdbd"));
		minusButton.setForeground(Color.BLACK);
		minusButton.setOpaque(true);
	    minusButton.setFocusPainted(false);
	    minusButton.setBorderPainted(false);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(237,400,75,80);
		plusButton.setFont(new Font("Arial", Font.PLAIN, 30));
		plusButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		plusButton.setBackground(Color.decode("#bdbdbd"));
		plusButton.setForeground(Color.BLACK);
		plusButton.setOpaque(true);
	    plusButton.setFocusPainted(false);
	    plusButton.setBorderPainted(false);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(105,490,110,60);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 25));
		clearButton.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		clearButton.setBackground(Color.decode("#070707"));
		clearButton.setForeground(Color.WHITE);
		clearButton.setOpaque(true);
	    clearButton.setFocusPainted(false);
	    clearButton.setBorderPainted(false);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
			
		}else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}else if(e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
			
			
		}else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
			
			
		}else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else if(e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource()==dotButton) {
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
			
		}else if(e.getSource()==equalButton) {
			isOperatorClicked=true;
			
			switch (operation) {
			case 1: {

			String newValue=displayLabel.getText();
			float oldValuef=Float.parseFloat(oldValue);
			float newValuef=Float.parseFloat(newValue);
			
			float result=oldValuef+newValuef;
			
			displayLabel.setText(result+"");
			
		    }
			break;
			case 2:{
			
			String newValue2=displayLabel.getText();
			float oldValuef2=Float.parseFloat(oldValue2);
			float newValuef2=Float.parseFloat(newValue2);

			float result2=oldValuef2-newValuef2;
			
			displayLabel.setText(result2+"");
			
			}
			break;
			case 3:{
				
				String newValue3=displayLabel.getText();
				float oldValuef3=Float.parseFloat(oldValue3);
				float newValuef3=Float.parseFloat(newValue3);

				float result3=oldValuef3*newValuef3;
				
				displayLabel.setText(result3+"");
				
			}
			break;
            case 4:{
				
				String newValue4=displayLabel.getText();
				float oldValuef4=Float.parseFloat(oldValue4);
				float newValuef4=Float.parseFloat(newValue4);

				float result4=oldValuef4/newValuef4;
				
				displayLabel.setText(result4+"");
            }	
			break;
			default:{
				displayLabel.setText("");
			}
			}
				    
					
			
		}else if(e.getSource()==divButton) {
			operation=4;
			isOperatorClicked=true;
			oldValue4=displayLabel.getText();
		
			
		}else if(e.getSource()==mulButton) {
			operation=3;
			isOperatorClicked=true;
			oldValue3=displayLabel.getText();
			
		}else if(e.getSource()==minusButton) {	
		
			operation=2;
			isOperatorClicked=true;
			oldValue2=displayLabel.getText();
			
		}else if(e.getSource()==plusButton) {
			operation=1;
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
			
		}
		
	}

}


