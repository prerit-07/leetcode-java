package LEETCODE.Arrays;
//1672
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i =0 ;i <accounts.length ;i++){
            int answer = 0;
            for(int j = 0 ; j<accounts[i].length; j++){
                answer += accounts[i][j];
            }
            if(answer > ans || answer == 0){
                ans = answer;
            }
        }
        return ans;
    }
}
