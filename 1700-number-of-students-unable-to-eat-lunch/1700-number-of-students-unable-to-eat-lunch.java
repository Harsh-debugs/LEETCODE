class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero=0;
        int one=0;
        for(int student:students){
            if(student==0)
                zero++;
            else
                one++;
        }
        for(int s:sandwiches){
            if(s==0){
                if(zero==0){
                    break;
                }
                zero--;
            }
            else{
                if(one==0){
                    break;
                }
                one--;
            }
        }
        return zero+one;
    }
}