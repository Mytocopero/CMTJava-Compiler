for i in $(seq 1 30)
do 
	res=`java -cp ./build test.LinkedBlockingQueue.Main 4 >> Linke_4.txt`
done

for i in $(seq 1 30)
do 
	res=`java -cp ./build test.LinkedBlockingQueue.Main 16 >> Linke_16.txt`
done

for i in $(seq 1 30)
do 
	res=`java -cp ./build test.LinkedBlockingQueue.Main 32 >> Linke_32.txt`
done

for i in $(seq 1 30)
do 
	res=`java -cp ./build test.LinkedBlockingQueue.Main 64 >> Linke_64.txt`
done






for i in $(seq 1 30)
do 
	res=`java -cp ./build test.Account.Test 4 4000 >> Account_4.txt`
done

for i in $(seq 1 30)
do 
	res=`java -cp ./build test.Account.Test 16 4000 >> Account_16.txt`
done

for i in $(seq 1 30)
do 
	res=`java -cp ./build test.Account.Test 32 4000 >> Account_32.txt`
done

for i in $(seq 1 30)
do 
	res=`java -cp ./build test.Account.Test 64 4000 >> Account_64.txt`
done

