class Solution{
public:
void shuffleArray(int arr[],int n)
{
    // Your code goes here
    int aindex=0;
    int bindex=n/2;
    int maxi= *max_element(arr,arr+n)+1;
    for(int i=0;i<n;i++){
            arr[i]=arr[i]*maxi;
    }
    for(int i=0;i<n;i++){
        if(i%2==0){
            arr[i]+=arr[aindex]/maxi;
            aindex++;
        }
        else{
            arr[i]+=arr[bindex]/maxi;
            bindex++;
        }
    }
    for(int i=0;i<n;i++){
            arr[i]=arr[i]%maxi;
    }
    
} 
};
