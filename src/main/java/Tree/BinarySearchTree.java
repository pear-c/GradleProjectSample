package Tree;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class BinarySearchTree {
    TreeNode root;  // 트리의 루트 노드

    // 노드 삽입 메서드 -> 트리에 값을 삽입
    public void insert(int val) {
        root = insertNode(root, val);
    }

    // 재귀적으로 노드 삽입
    private TreeNode insertNode(TreeNode root, int val) {
        // 비어있는 위치에 노드 삽입
        if(root == null)
            return new TreeNode(val);
        // 삽입 값이 현재 노드 값보다 작으면 왼쪽으로 보냄
        if(val < root.val) {
            root.left = insertNode(root.left, val);
        }
        // 삽입 값이 현재 노드 값보다 크면 오른쪽으로 보냄
        else if(val > root.val) {
            root.right = insertNode(root.right, val);
        }
        // 값이 같으면 처리하지 않음
        return root;
    }


    // 노드 탐색 메서드 -> 값이 트리에 존재하는지 확인
    public boolean search(int val) {
        return searchNode(root, val);
    }
    // 재귀적으로 값 탐색
    private boolean searchNode(TreeNode root, int val) {
        // 값이 없음 -> 탐색 종료
        if(root == null)
            return false;
        // 값이 발견되면
        if(root.val == val)
            return true;
        // 왼쪽 서브트리 탐색
        else if(val < root.val) {
            return searchNode(root.left, val);
        }
        // 오른쪽 서브트리 탐색
        else {
            return searchNode(root.right, val);
        }
    }

    // 노드 삭제 메서드
    public void delete(int val) {
        root = deleteNode(root, val);
    }
    // 재귀적으로 노드 삭제
    private TreeNode deleteNode(TreeNode root, int val) {
        // 트리가 비어있는지 체크
        if(root == null)
            return null;

        // 왼쪽 서브트리 탐색
        if(val < root.val) {
            root.left = deleteNode(root.left, val);
        }
        // 오른쪽 서브트리 탐색
        else if(val > root.val) {
            root.right = deleteNode(root.right, val);
        }
        // 삭제해야 할 노드를 발견했을 때
        else {
            // 자식이 없는 경우
            if(root.left == null && root.right == null) {
                return null;
            }
            // 하나의 자식만 있는 경우
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }
            // 두 자식이 있는 경우
            // 오른쪽 서브트리에서 최솟값을 찾음
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val; // 최솟값으로 현재 노드 대체
            root.right = deleteNode(root.right, minNode.val);   // 최솟값 노드 삭제
        }
        return root;
    }

    // 최솟값 찾는 메서드
    private TreeNode findMin(TreeNode root) {
        // 트리가 비어있으면 null 반환
        if(root == null)
            return null;
        // 왼쪽 자식이 존재하는 동안 이
        while(root.left != null) {
            root = root.left;
        }
        // 가장 왼쪽에 있는 노드 반환
        return root;
    }

    // 전위 순회 Preorder Traversal
    public void preOrder(TreeNode node) {
        if(node == null)
            return;
        System.out.println(node.val + " ");
        preOrder(node.left);    // 왼쪽 서브트리 방문
        preOrder(node.right);   // 오른쪽 서브트리 방문
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        // 트리에 값 삽입
        bst.insert(5);
        bst.insert(2);
        bst.insert(7);
        bst.insert(1);
        bst.insert(9);

        // 전위 순회 결과 출력 -> 트리 구조 출력하거나 복사할 때 사용
        System.out.println("PreOrder: ");
        bst.preOrder(bst.root);
        System.out.println();

    }
}
