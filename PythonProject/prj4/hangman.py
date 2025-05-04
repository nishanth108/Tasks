import random
import string
from word import words

def get_valid_word(word):
    word = random.choice(word)  #Randomly choices something from the list
    while '-' in word or ' ' in word :
        word = random.choice(words)
    
    return word.upper()

def hangman():
    word = get_valid_word(words)  #getting a valid word without a space and -
    word_letters = set(word) #letters in the word
    alphabet = set(string.ascii_uppercase)
    used_letters = set() #   in order to track what the user guessed
    
    low = 7
    #getting user input
    while len(word_letters) > 0  and low > 0:
        # letters used
        # ' '.join(['a', 'b', 'cd']) --> 'a b cd'
        print(f"you have {low} life \n")
        if len(used_letters) > 0:
            print("You have used these letters: ",' '.join(used_letters))

        #what current word is (ie W - R D )
        word_list = [letter if letter in used_letters else '-' for letter in word]
        print('current Word',' '.join(word_list))
        
        
        user_letter = input('Guess a letter:').upper()   #taking input from the user
        if user_letter in alphabet - used_letters :      #making set operation on alphabet and used_letters (Minus operation)
            used_letters.add(user_letter)                #if the user_letter in alphabet than we have to add it to used_letter
            if user_letter in word_letters:              #If user letter in word_letter than remove the leter from word_letter
                word_letters.remove(user_letter)  
            else :
                 low =low-1      

        elif user_letter in used_letters:
            print("You have already used the character.Please try again.")
        
        else:
            print("You didnt type  the valid keyword")
    if low == 0 :
            print("No More Lifes") 
# gets here when len(word_letters)==0

hangman()