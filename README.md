# Password-Generator
This program generates a random password for the user. The user can choose the length of the password and if it uses special characters or not.

## How It's Made:

**Concepts used:** arrays, scanners, loops, and a flurry of math.
### Methods
I created two methods for generating random characters: getLetter() and getSymbol().GgetLetter() generates random letters from the alphabet (both uppercase and lowercase), while getSymbol() generates random special symbols. 

These methods function through use of 2 arrays: one filled with alphabets and another filled with special symbols. When the methods are called a random index is generated and the character at that index is returned by the method.

### Main program
In the main method, the program prompts the user for input. It asks the user how many characters they want in the password. It also asks if the user wants to include special symbols (Y or N).

The program then creates an array called passwordArray to store the password characters. Based on the user's input regarding whether to use symbols, the program fills the passwordArray: If the user wants to include symbols, it iterates through the array, randomly selecting either a letter or a symbol for each position. It ensures that at least one symbol is included in the password. If the user doesn't want symbols, it fills the password with random letters.

Finally, the program prints out the generated password to the console.

## Lessons Learned:
Perfect isn't always perfect 
 If the user wants both symbols and letters, program will randomly pick how many of each type to fill the password with. Originally, I used a 50% chance for 
 each. However, that looked very unnatural because most people create password that have more letters than symbols. The current progam now has a bias towards  
 letters to reflect that. This served as important reminder to think critically when designing programs. The simple solution isn't always best due to the biases  and patterns innnate to human psychology.

Larger programs always break
 This was at the time the largest project I had ever programmed. I initally thought the implimentation would be fairly simple and not take long. I was very 
 wrong because once you code anything beyond "Hello World" there is 100% guarantee things will go wrong or problems you didn't predict will come up. This 
 program let me practice patience and problem solving.
 
