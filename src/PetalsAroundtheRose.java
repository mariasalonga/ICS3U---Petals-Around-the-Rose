/*Maria Salonga
 * Wednesday, June 2, 2021
 * This program runs a GUI of the game Petals Around the Rose*/
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PetalsAroundtheRose {
	//These are the different variables
	//This variable keeps track of how many guesses the user has
	static int  count = 0;
	
	//These are the randomly generated numbers that determine how many dots will appear on the dice 
	static int randNumArray[] = {0,0,0,0,0,0};
	
	//These variables keep track of how many petals appear on each dice and stores the actual answer in a string variable
	static int answerPanel[] = {0,0,0,0,0,0};
	static int ans = 0;
	static String answer;
	
	//These are the panels that contain the picture
	static JPanel panelArray[] = {new JPanel(),new JPanel(),new JPanel(),new JPanel(),new JPanel(),new JPanel()};
	static JPanel picturePanel = new JPanel();
	
	//These are the images of the dice. I used arrays to store the variables to save space
	
	//panel 1
	static ImageIcon diceOne = new ImageIcon("Images/diceOne.png");
	static ImageIcon diceTwo = new ImageIcon("Images/diceTwo.png");
	static ImageIcon diceThree = new ImageIcon("Images/diceThree.png");
	static ImageIcon diceFour = new ImageIcon("Images/diceFour.png");
	static ImageIcon diceFive = new ImageIcon("Images/diceFive.png");
	static ImageIcon diceSix = new ImageIcon("Images/diceSix.png");
	static JLabel panelOne[] = {new JLabel(diceOne),new JLabel(diceTwo),new JLabel(diceThree),new JLabel(diceFour),new JLabel(diceFive),new JLabel(diceSix)};	
	
	//panel 2
	
	static ImageIcon diceOne2 = new ImageIcon("Images/diceOne.png");
	static ImageIcon diceTwo2 = new ImageIcon("Images/diceTwo.png");
	static ImageIcon diceThree2 = new ImageIcon("Images/diceThree.png");
	static ImageIcon diceFour2 = new ImageIcon("Images/diceFour.png");
	static ImageIcon diceFive2 = new ImageIcon("Images/diceFive.png");
	static ImageIcon diceSix2 = new ImageIcon("Images/diceSix.png");
	static JLabel panelTwo[] = {new JLabel(diceOne2),new JLabel(diceTwo2),new JLabel(diceThree2),new JLabel(diceFour2),new JLabel(diceFive2),new JLabel(diceSix2)};
	
	//panel 3
	static ImageIcon diceOne3 = new ImageIcon("Images/diceOne.png");
	static ImageIcon diceTwo3 = new ImageIcon("Images/diceTwo.png");
	static ImageIcon diceThree3 = new ImageIcon("Images/diceThree.png");
	static ImageIcon diceFour3 = new ImageIcon("Images/diceFour.png");
	static ImageIcon diceFive3 = new ImageIcon("Images/diceFive.png");
	static ImageIcon diceSix3 = new ImageIcon("Images/diceSix.png");
	static JLabel panelThree[] = {new JLabel(diceOne3),new JLabel(diceTwo3),new JLabel(diceThree3),new JLabel(diceFour3),new JLabel(diceFive3),new JLabel(diceSix3)};
	
	//panel 4
	static ImageIcon diceOne4 = new ImageIcon("Images/diceOne.png");
	static ImageIcon diceTwo4 = new ImageIcon("Images/diceTwo.png");
	static ImageIcon diceThree4 = new ImageIcon("Images/diceThree.png");
	static ImageIcon diceFour4 = new ImageIcon("Images/diceFour.png");
	static ImageIcon diceFive4 = new ImageIcon("Images/diceFive.png");
	static ImageIcon diceSix4 = new ImageIcon("Images/diceSix.png");
	static JLabel panelFour[] = {new JLabel(diceOne4),new JLabel(diceTwo4),new JLabel(diceThree4),new JLabel(diceFour4),new JLabel(diceFive4),new JLabel(diceSix4)};
	
	//panel 5
	static ImageIcon diceOne5 = new ImageIcon("Images/diceOne.png");
	static ImageIcon diceTwo5 = new ImageIcon("Images/diceTwo.png");
	static ImageIcon diceThree5 = new ImageIcon("Images/diceThree.png");
	static ImageIcon diceFour5 = new ImageIcon("Images/diceFour.png");
	static ImageIcon diceFive5 = new ImageIcon("Images/diceFive.png");
	static ImageIcon diceSix5 = new ImageIcon("Images/diceSix.png");
	static JLabel panelFive[] = {new JLabel(diceOne5),new JLabel(diceTwo5),new JLabel(diceThree5),new JLabel(diceFour5),new JLabel(diceFive5),new JLabel(diceSix5)};
	
	//panel 6
	static ImageIcon diceOne6 = new ImageIcon("Images/diceOne.png");
	static ImageIcon diceTwo6 = new ImageIcon("Images/diceTwo.png");
	static ImageIcon diceThree6 = new ImageIcon("Images/diceThree.png");
	static ImageIcon diceFour6 = new ImageIcon("Images/diceFour.png");
	static ImageIcon diceFive6 = new ImageIcon("Images/diceFive.png");
	static ImageIcon diceSix6 = new ImageIcon("Images/diceSix.png");
	static JLabel panelSix[] = {new JLabel(diceOne6),new JLabel(diceTwo6),new JLabel(diceThree6),new JLabel(diceFour6),new JLabel(diceFive6),new JLabel(diceSix6)};

	
	//These methods checks what the random numbers are and then display the corresponding dice
	//panel one
	public static void checkRandNum() {
		switch (randNumArray[0]) {
		case 1:
			panelOne[0].setVisible(true);
			break;
		case 2:
			panelOne[1].setVisible(true);
			break;
		case 3:
			panelOne[2].setVisible(true);
			break;
		case 4:
			panelOne[3].setVisible(true);
			break;
		case 5:
			panelOne[4].setVisible(true);	
			break;
		case 6:
			panelOne[5].setVisible(true);	
			break;
		}
	}
	//panel two
	public static void checkRandNum2() {
		switch (randNumArray[1]) {
		case 1:
			panelTwo[0].setVisible(true);	
			break;
		case 2:
			panelTwo[1].setVisible(true);
			break;
		case 3:
			panelTwo[2].setVisible(true);
			break;
		case 4:
			panelTwo[3].setVisible(true);
			break;
		case 5:
			panelTwo[4].setVisible(true);	
			break;
		case 6:
			panelTwo[5].setVisible(true);
			break;
		}
	}
	//panel three
	public static void checkRandNum3() {
		switch (randNumArray[2]) {
		case 1:
			panelThree[0].setVisible(true);	
			break;
		case 2:
			panelThree[1].setVisible(true);
			break;
		case 3:
			panelThree[2].setVisible(true);
			break;
		case 4:
			panelThree[3].setVisible(true);
			break;
		case 5:
			panelThree[4].setVisible(true);	
			break;
		case 6:
			panelThree[5].setVisible(true);	
			break;
		}
	}
	//panel four
	public static void checkRandNum4() {
		switch (randNumArray[3]) {
		case 1:
			panelFour[0].setVisible(true);	
			break;
		case 2:
			panelFour[1].setVisible(true);
			break;
		case 3:
			panelFour[2].setVisible(true);
			break;
		case 4:
			panelFour[3].setVisible(true);
			break;
		case 5:
			panelFour[4].setVisible(true);	
			break;
		case 6:
			panelFour[5].setVisible(true);	
			break;
		}
	}
	//panel five
	public static void checkRandNum5() {
		switch (randNumArray[4]) {
		case 1:
			panelFive[0].setVisible(true);	
			break;
		case 2:
			panelFive[1].setVisible(true);
			break;
		case 3:
			panelFive[2].setVisible(true);
			break;
		case 4:
			panelFive[3].setVisible(true);
			break;
		case 5:
			panelFive[4].setVisible(true);	
			break;
		case 6:
			panelFive[5].setVisible(true);	
			break;
		}
	}
	//panel six
	public static void checkRandNum6() {
		switch (randNumArray[5]) {
		case 1:
			panelSix[0].setVisible(true);	
			break;
		case 2:
			panelSix[1].setVisible(true);
			break;
		case 3:
			panelSix[2].setVisible(true);
			break;
		case 4:
			panelSix[3].setVisible(true);
			break;
		case 5:
			panelSix[4].setVisible(true);	
			break;
		case 6:
			panelSix[5].setVisible(true);	
			break;
		}
	}
	
	//This method checks if the random number is correct and has petals
	public static void checkAnswer() {
		ans = 0;
		for(int x = 0;x < 6;x++) {
			if (randNumArray[x] == 3) {
				ans = ans + 2;
			} else if (randNumArray[x] == 5) {
				ans = ans + 4;
			} 
		}
		answer = answer.valueOf(ans);
	}
	
	public static void generateStuff() {
		//This checks whether the count is less than three and removes all contents from the panel
		if (count < 3) {
			setInvisible();
		}
		
		//These are the randomly generated numbers
	    for(int x = 0;x < 6;x++) {
	    	randNumArray[x] = (int) (Math.random() * 6) + 1;
	    	while (randNumArray[3] == 5) {
				randNumArray[3] = (int) (Math.random() * 6) + 1;
			}
			
			while (randNumArray[4] == 5) {
				randNumArray[4] = (int) (Math.random() * 6) + 1;
			}
	    }
	    
		//Here I am setting the visibility of the photos to true depending on the random number
		checkRandNum();		
		checkRandNum2(); 
		checkRandNum3();		 
		checkRandNum4();	
		checkRandNum5();		
		checkRandNum6();
		
		//This check what is the correct answer		
		 checkAnswer();	
	}
	
	//This method adds every picture to their respective panel
	public static void addPictures() {
		for(int x = 0; x < 6; x++) {
			panelArray[0].add(panelOne[x]);
		}
		for(int x = 0; x < 6; x++) {
			panelArray[1].add(panelTwo[x]);
		}
		for(int x = 0; x < 6; x++) {
			panelArray[2].add(panelThree[x]);
		}
		for(int x = 0; x < 6; x++) {
			panelArray[3].add(panelFour[x]);
		}
		for(int x = 0; x < 6; x++) {
			panelArray[4].add(panelFive[x]);
		}
		for(int x = 0; x < 6; x++) {
			panelArray[5].add(panelSix[x]);
		}

	}
	
	//This method sets all the photos to invisible
	public static void setInvisible() {
		for(int x = 0; x < 6; x++) {
			panelOne[x].setVisible(false);
		}
		for(int x = 0; x < 6; x++) {
			panelTwo[x].setVisible(false);
		}
		for(int x = 0; x < 6; x++) {
			panelThree[x].setVisible(false);
		}
		for(int x = 0; x < 6; x++) {
			panelFour[x].setVisible(false);
		}
		for(int x = 0; x < 6; x++) {
			panelFive[x].setVisible(false);
		}
		for(int x = 0; x < 6; x++) {
			panelSix[x].setVisible(false);
		}
	}	
	//start of the main method
	public static void main(String[] args) {
		
		//Here I am setting each individual layout to grid bag layout
		for(int x = 0; x < 6; x++) {
			panelArray[x].setLayout(new GridBagLayout());
		}	
		
		//This adds all the pictures to the panel and then sets them invisible
		addPictures();
		setInvisible();
		
		//This is where the JFrame is made
		JFrame game = new JFrame();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setSize(700,700);
		game.setLayout(new BorderLayout());
		game.setTitle("Petals Around the Rose");
		game.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		//Changing the icon to roses
		Image icon = Toolkit.getDefaultToolkit().getImage("Images/Rose.jpg");    
	    game.setIconImage(icon);
		
	    //Giving a welcome message to the user
	    JPanel labelPanel = new JPanel();
        JLabel label = new JLabel("Welcome to Petals Around the Rose. In order to win you must guess correctly 3 times in a row!");
        label. setFont(new Font("Dancing Script OT", Font. PLAIN, 30));
        labelPanel.add(label);
		
		//Here is a new panel with the pictures
		picturePanel.setLayout(new GridBagLayout());
		
		//Here is he panel which all the messages will appear
		JPanel messagePanel = new JPanel();
		
		//The guessing JPanel contains a JComboBox (drop down menu)
        JPanel guessingPanel = new JPanel();
        
        //Options for the JComboBox
        String[] dropDownNumbers = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20", "21", "22", "23", "24"};
        JComboBox options = new JComboBox(dropDownNumbers);
        guessingPanel.add(options);
		
        //This panel tells the user if they are correct, incorrect, and if they have won
        JPanel message = new JPanel();
        JLabel msg = new JLabel();
        msg. setFont(new Font("Dancing Script OT", Font. PLAIN, 30));
        message.add(msg);
        messagePanel.add(message);
        message.setVisible(true);
        
        //Generating new images and adding them to the panel
        generateStuff();
        
        //Here I am adding the panels to the bigger panel
        for(int x = 0; x < 6; x++) {
        	picturePanel.add(panelArray[x]);			
        }
        
		//Here, all the panels are being added to the frame
		game.add(labelPanel, BorderLayout.PAGE_START);		
		game.add(picturePanel, BorderLayout.CENTER);		
		game.add(guessingPanel, BorderLayout.LINE_END);		
		game.add(messagePanel, BorderLayout.PAGE_END);
		
		//This is the action listener	
		options.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent event)
				{
					//This line checks whether the user is correct or not and then refreshes the images and answer if the have only 2 correct
					if((((JComboBox) event.getSource()).getSelectedItem()).equals(answer) && count <= 3) {
						count ++;
						msg.setText("You have guessed correctly!"); 
						msg.setForeground(Color.BLUE);
						
						//This checks whether they have gotten three guesses correct in a row
						if(count == 3) {
							msg.setText("You have won the game!"); 
							msg.setForeground(Color.GREEN);
							guessingPanel.setVisible(false);
						//This generates new images if the count is not equal to three	
						} else if (count <= 2) {			
							generateStuff();						
						}
						//This checks whether they are incorrect, informs them, refreshes the images, and refreshes the count to 0

						} else if (!(((JComboBox) event.getSource()).getSelectedItem()).equals(answer)){
							count = 0;		
							msg.setText("You have guessed incorrectly!"); 
							msg.setForeground(Color.RED);	
							generateStuff();							
					}	
					
				}
				
			});		
		//setting visibility to true
		game.setVisible(true);		
	}

}