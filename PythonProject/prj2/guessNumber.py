import random

def guess(x):
    number =random.randint(1,x)
    guess = 0 
    while guess != number:
        guess = int(input(f'Guess a number between 1 to {x}'))
        if guess > number :
            print('The Number is too Large')
        elif guess < number :
            print("The Number is too Low")
    print(f'Yup You Guessed The Correct Number {number}')
    
    
def computer_guess(x):
    low = 1
    high = x
    feedback = " "
    while feedback != "c" :
        if low !=high :
            guess = random.randint(low,high)
        else :
            guess = low
        feedback =input(f"Is {guess} too high(H),too low(L) Or correct(C)").lower()
        if feedback == "h" :
            high = guess-1
        
        elif feedback == "l":
            low = guess+1
    print("Yah! you have guessed the Number")
        
# guess(10)
computer_guess(10)
    