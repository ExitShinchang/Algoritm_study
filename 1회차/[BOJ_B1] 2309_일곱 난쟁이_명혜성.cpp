#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector <int>dwarfs;
int sum = 0;

void input() {
	int n;
	for (int i = 0; i < 9; i++) {
		cin >> n;
		dwarfs.push_back(n);
		sum += n;
	}
}

void output(int a, int b) {
	for (int i = 0; i < 9; i++) {
		if (i != a && i != b) {
			cout << dwarfs.at(i) << endl;
		}
	}
}

void solve() {
	sort(dwarfs.begin(), dwarfs.end());
	
	for (int i = 0; i < 9; i++) {
		for (int j = i + 1; j < 9; j++) {
			if (sum - (dwarfs.at(i) + dwarfs.at(j)) == 100) {
				output(i, j);
				return;
			}
			else;
		}
	}

}


int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	input();
	solve();

}