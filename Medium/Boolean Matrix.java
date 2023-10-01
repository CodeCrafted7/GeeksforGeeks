class Solution
{
    void booleanMatrix(int matrix[][])
    {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean rowset[]=new boolean[row];
        boolean colset[]=new boolean[col];
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<col;j++)
          {
              if(matrix[i][j]==1)
              {
                  rowset[i]=true;
                  colset[j]=true;
                  }
          }
      }
                   for(int i=0;i<row;i++)
                 {
               for(int j=0;j<col;j++)
            {
              if(rowset[i] || colset[j])
              {
                  matrix[i][j]=1;
              }
             }
          }
      }
    }
