def bubble_sort(arr):
	for x in range(0,len(arr)-1):
		for a in range(0,len(arr)-1):
			if(arr[a]>arr[a+1]):
				temp=arr[a]
				arr[a]=arr[a+1]
				arr[a+1]=temp
	print(arr)

arr=[5,2,1,3,4]
bubble_sort(arr)
