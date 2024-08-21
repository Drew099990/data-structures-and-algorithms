class bubble_sort:
    def __init__(self,array):
        for x in range(len(array)-1):
            for y in range(len(array)-1):
                if array[y] > array[y + 1]:
                    temp = array[y]
                    array[y] = array[y + 1]
                    array[y + 1] = temp
                    print(array)
array=[7,8,2,3,4]       
bubble_sort(array)                    