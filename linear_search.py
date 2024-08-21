import string

def linear(inputs,list):
    count = 0
    for x in inputs:
        for y in list:
            
            if x == y:
                return f"found at index {count}"
            count += 1
    return -1        
print(linear("a",list(string.ascii_letters)))
