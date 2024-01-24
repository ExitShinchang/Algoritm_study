#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int num = 0;
vector <int> numList;
int ans[6];


void dfs(int start, int depth) {
	if (depth == 6) {
		for (int i = 0; i < 6; i++) {
			cout << ans[i] << " ";
		}
		cout << endl;
		return;
	}

	for (int i = start; i < num; i++) {
		ans[depth] = numList[i];
		dfs(i + 1, depth + 1);
	}

}



int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL); 
	
	cin >> num;
	
	while (num != 0) {
		int n;
		for (int i = 0; i < num; i++) {
			cin >> n;
			numList.push_back(n);
		}

		sort(numList.begin(), numList.end());

		dfs(0, 0);
		cout << endl;

		numList.clear();
		cin >> num;
	}

	return 0;
}
