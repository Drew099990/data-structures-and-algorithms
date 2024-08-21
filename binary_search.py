

def binary(input,list):
    min = 0 
    max = len(list)
    mid = 0
    for num,x in enumerate (list):
        if input > x:
            if x == input :
                return f"value of {x} found at index {num}"         
    
            else:
                min = x
                mid = (max+min)/2
        else :
            if x == input :
                return f"value of {x} found at index {num}"         
    
            else:
                max = x
                mid = (max+min)/2
    return f"value of {input} not found"         
    
print(binary(90,[1,33,44,66,90,99]))
print(binary(990,[22,33,900,990,100]))
print(binary(910,[22,33,900,990,100000]))
print(binary(100000,[22,33,900,990,100000]))


 
