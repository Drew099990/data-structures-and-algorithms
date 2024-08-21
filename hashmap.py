records = {"mon":"2570","tue":"2345","wen":"600"}
#
total = 0
for x in records.values():
    total += int(x)
   
print(str(records)) 
print(f"and the total amount was ${total}") 

  
