#include <iostream>
using namespace std;


int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	long long S;

	cin >> S;


	long long num = 0;

	while (S > 0) {
		num++;
		S = S - num;
	}

	if (S < 0) {
		num--;
	}

	cout << num;

	return 0;
}