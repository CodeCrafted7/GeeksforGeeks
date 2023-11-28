class Solution
{
    public:
    //Function to detect cycle using DSU in an undirected graph.
	int find(int i,int parent[]){
        if(parent[i]==i){
            return i;
        }
        parent[i]=find(parent[i],parent);
        return parent[i];
    }
    void Union(int i,int j,int rank[],int parent[]){
         int irep=find(i,parent);
         int jrep=find(j,parent);
         if(irep==jrep )return;
         int irank=rank[irep];
         int jrank=rank[jrep];
         if(irank<jrank){
            parent[irep]=jrep; 
         }else if(irank>jrank){
             parent[jrep]=irep;
         }else{
             parent[irep]=jrep;
             rank[jrep]++;
         }
    }
    int detectCycle(int V, vector<int>adj[])
    {
        int rank[V]={},parent[V];
        for(int i=0;i<V;i++)parent[i]=i;
        for(int i=0;i<V;i++){
            for(int j=0;j<adj[i].size();j++){
                if(i<adj[i][j]){
                    int first=find(i,parent);
                    int second=find(adj[i][j],parent);
                    if(first==second)return 1;
                    else Union(first,second,rank,parent);
                }
            }
        }
        return 0;
    }
};
