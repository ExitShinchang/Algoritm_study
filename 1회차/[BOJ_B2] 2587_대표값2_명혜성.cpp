#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector <int> numList;

void input() {
	for (int i = 0; i < 5; i++) {
		cin >> numList[i];
	}
}

int mean() {
	int sum = 0;
	for (int i = 0; i < 5; i++) {
		sum += numList[i];
	}

	return sum / 5;
}

int median() {
	sort(numList.begin(), numList.end());
	return numList[2];
}


int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	numList.resize(5);

	input();

	cout << mean() << endl;
	cout << median() << endl;
}