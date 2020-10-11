def display():
    temp = float(input("Input temperature in farenheit: "))
    print("Your temperature in celsius: {}".format(convert(temp)))
    
def convert(temp):
    return (temp - 32.0) * 5.0 / 9.0
    