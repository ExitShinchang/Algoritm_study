#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> graph[100001];
int visited[100001] = { 0, };
int result[100001];
int cnt = 0;


void dfs(int R) {
	if (visited[R] == 1)
		return;
	else {
		visited[R] = 1;
		result[R] = ++cnt;

		for (int i = 0; i < graph[R].size(); i++) {
			dfs(graph[R][i]);
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL); 

	int N, M, R;
	scanf("%d %d %d", &N, &M, &R);

	for (int i = 1; i <= M; i++) {
		int a, b;
		scanf("%d %d", &a, &b);
		graph[a].push_back(b);
		graph[b].push_back(a);
	}

	for (int i = 1; i <= N; i++) {
		sort(graph[i].begin(), graph[i].end());
	}
	
	dfs(R);
	
	for (int i = 1; i <= N; i++) {
		printf("%d\n", result[i]);
	}

}