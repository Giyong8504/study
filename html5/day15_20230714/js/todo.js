window.addEventListener("DOMContentLoaded", function() {
    const todos = document.getElementById("todos");
    const registerEl = document.getElementById("register");
    registerEl.addEventListener("click", function() {
        try {
            
            const todo = frm.todo.value;
            if (!todo.trim()) { // 값이 입력되지 않은 경우
                throw new Error("오늘 할일을 입력하세요.");
            }
            
            createTodo(todo);

        } catch(err) {
            alert(err.message);
        }
    });

    const insertEl = document.getElementById("insert");
    insertEl.addEventListener("click", function() {
        const lastEl = todos.lastElementChild;
        const li = createTodo("테스트");
        todos.insertBefore(li, lastEl);
    });

    function createTodo(todo) {

        // 오늘 할일을 입력한 경우
        const li = document.createElement("li");
        const text = document.createTextNode(todo);
        li.appendChild(text);
        
        const span = document.createElement("span");
        const removeTxt = document.createTextNode("[X]");
        span.appendChild(removeTxt);
        li.appendChild(span);

        todos.appendChild(li);
        
        frm.todo.value = "";
        frm.todo.focus();
        

        // 할일 제거
        span.addEventListener("click", function() {
            if (confirm("정말 삭제하시겠습니까?")) {
                todos.removeChild(li); 
            }
        });


        return li;
    }
});
