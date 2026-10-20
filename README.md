# task-manager

A console task manager: add tasks, list them, mark complete / remove, via a menu.

> Built within my first ~4–5 months of learning Java (a coding course). Kept as a record of progress, not as polished production code.

## Run
```bash
find src -name '*.java' | xargs javac -d out
java -cp out taskmanager.TaskManagerApp
```

## Fixes / flags
- Added a `main` launcher (`TaskManagerApp`) — the project had none.
- Added `TaskManager`'s missing constructor and filled the empty `removeTask()`.
- `updateTask` is still unfinished and is intentionally left off the menu.
