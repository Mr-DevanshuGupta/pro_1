int sumOfXorPairs(vector<int>& A) {
    vector<int> freq(3, 0);
    int result = 0;

    for (int num : A) {
        int rem = num % 3;
        freq[rem]++;
    }

    for (int rem = 0; rem < 3; rem++) {
        int count = freq[rem];
        result += count * (count - 1) / 2;
    }

    for (int num : A) {
        int rem = num % 3;
        freq[rem]--;
        result += freq[(rem + 1) % 3] * num;
    }

    return result;
}

int main() {
    int N = 4;
    vector<int> A = {3, 6, 5, 11};
    
    int answer = sumOfXorPairs(A);
    cout << "The sum of 'A[i] xor A[j]' for all valid pairs is: " << answer << endl;

    return 0;
}