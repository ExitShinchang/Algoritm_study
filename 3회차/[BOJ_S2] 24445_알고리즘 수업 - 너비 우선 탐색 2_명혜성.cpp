#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
using namespace std;

vector<int> graph[100001];
int visited[100001] = { 0, };
int result[100001];
int cnt = 0;
queue<int> Q;

void bfs(int r) {
	Q.push(r);
	visited[r] = 1;
	result[r] = ++cnt;

	while (!Q.empty()) {
		int fr = Q.front();
		Q.pop(); //void return

		for (int i = 0; i < graph[fr].size(); i++) {
			int x = graph[fr][i];
			if (!visited[x]) {
				visited[x] = 1;
				Q.push(x);
				result[x] = ++cnt;
			}
		}
	}
}


int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, m, r;
	scanf("%d %d %d", &n, &m, &r);

	for (int i = 0; i < m; i++) {
		int a, b;
		scanf("%d %d", &a, &b);
		graph[a].push_back(b);
		graph[b].push_back(a);
	}

	for (int i = 1; i <= n; i++) {
		sort(graph[i].begin(), graph[i].end(),greater<int>());
	}

	bfs(r);

	for (int i = 1; i <= n; i++) {
		printf("%d\n", result[i]);
	}

}