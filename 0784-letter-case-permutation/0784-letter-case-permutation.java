class Solution {
    public List<String> letterCasePermutation(String s) {

        List<String> result = new ArrayList<>();
        result.add("");

        for(char ch : s.toCharArray()) {

            List<String> temp = new ArrayList<>();

            for(String str : result) {

                if(Character.isDigit(ch)) {
                    temp.add(str + ch);
                } else {
                    temp.add(str + Character.toLowerCase(ch));
                    temp.add(str + Character.toUpperCase(ch));
                }
            }

            result = temp;
        }

        return result;
    }
}