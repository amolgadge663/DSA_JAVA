a = [1,3,6,9,10,23,46,57,68,100]
l = 0
h = len(a)-1
k = 4

def searchKey(a,l,h,k):
    mid = int((l+h)/2)

    if(a[mid]==k):
        print("Key is found...")
    elif(a[mid]<k):
        l=mid+1
        searchKey(a,l,h,k)
    elif(a[mid]>k):
        h=mid-1
        searchKey(a,l,h,k)
    else:
        print("The given key is not in array!!!!!!")

searchKey(a,l,h,k)