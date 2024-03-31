class Solution {
#include <iostream>
#include <vector>
public:
std::vector<int>::iterator it;
    vector<int> plusOne(vector<int>& digits) {
        int number = 0;
        int c = 0;
        for(auto i = digits.begin(); i<digits.end();i++){
            long place = pow(10, digits.size()-c);
            place = place * *i;
            number+= place;
            c++;
        }
        number= number + 1;
        for(int i = 0; i < digits.size();i++){
            long place = pow(10, digits.size()-i);
            digits.insert(digits.begin(), number%place);
        }
        return digits;
    }
};