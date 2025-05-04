import random

def play():
    user = input("'r' for rock, 'p' for paper, 's' for scissor")
    computer = random.choice(['r','p','s'])
    
    print(f"the Computer choiced {computer}")
    if user == computer:
        return 'tie'
    
    if is_win(user, computer):
        return "you! won"
    
    
    return "you! Lost"

    #r>s , s>p, p>r

def is_win(player, opponent) :
    #return true if the player wins
    # #r>s , s>p, p>r
    if (player == "r" and opponent == "s") or (player == "s" and opponent =="p") or (player == "p" and opponent == "r") :
        return True
    
print(play())