#include <iostream>
using namespace std;

int num = 0;
int count_num = 0;

void input() {
	cin >> num;
}

void output_line() {
	for (int i = 0; i < count_num; i++) {
		cout << "____";
	}
}

void recursive() {
	output_line();
	cout << "\"����Լ��� ������?\"" << endl;
	output_line();
	if (count_num == num) {
		cout << "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"" << endl;
	}
	else {
		cout << "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���." << endl;
		output_line();
		cout << "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���." << endl;
		output_line();
		cout << "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"" << endl;
		count_num++;
		recursive();
	}
	output_line();
	cout << "��� �亯�Ͽ���." << endl;
	count_num--;
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	input();
	cout << "��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������." << endl;
	recursive();
}