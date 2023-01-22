def prime_no(n):
	count=0
	for x in range(2,n):
		if n%x==0:			
			count=count+1
			if count==1:
				break
	if count==0:
		print("prime_no")
	else:
		print("Not prime_no")	

prime_no(99)

def min_max_prime_no(min_val,max_val):
	counter=0
	emp=[]
	for x in range(min_val,max_val+1,1):
		
		for a in range(2,x):
			#print(a)
			if x%a==0:
				counter=counter+1
			if counter==1:
				break
		if counter==0:
			print(x)
		counter=0
		
	print(emp)
min_max_prime_no(10,100)
