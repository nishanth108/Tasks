# """
#        Mad Libs
# String Concatination (to know how to put string togeter)
# suppose we want create a string that says "Subscribe to ___________"
# a few ways to do this
# """
# youtuber = "Nishu"
# print("Subscribe to "+ youtuber);

# #String . format
# print("Subscribe to {}".format(youtuber))

# #F string
# print(f"Subscribe to {youtuber}")

adj = input("Adjective :");
verb1 = input("verb:")
verb2 = input("verb:")
famous_person = input("Famous_person")
madLib =f"Computer programming is so {adj}! It makes me so excited all the time because \
I love to {verb1}. Stay hydrated and {verb2} like you are {famous_person}!";
    
print(madLib)