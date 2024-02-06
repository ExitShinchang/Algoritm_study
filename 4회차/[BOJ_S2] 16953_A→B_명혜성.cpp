#include <iostream>
using namespace std;



int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL); 

	int A, B;
	cin >> A >> B;

	int result = 1;

	while (1) {
		if (A == B)
			break;

		else if (A > B) {
			result = -1;
			break;
		}

		else {
			if (B % 2 == 0)
				B /= 2;
			else if (B % 10 == 1)
				B = (B - 1) / 10;
			else{ 
				result = -1; 
				break;
			}

			result++;
		}
	}

	cout << result;

	return 0;
}