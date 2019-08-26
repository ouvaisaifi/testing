a = open("test.txt","r")
read = a.read()
read = read.split(' ')
freq={}
for i in read:
	i = i.strip("\n")
	if i in freq:
		freq[i]+=1
	else:
		freq[i]=1
print(freq)
v,k = max((v,k) for k,v in freq.items())
print(v,k)
