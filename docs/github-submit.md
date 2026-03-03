# 提交代码到 GitHub（一次完整示例）

如果你已经在本地写好代码，并希望用提交信息 `codex 写的两数之和` 提交并推送到 GitHub，可以按下面做。

## 1) 查看当前状态

```bash
git status
```

## 2) 暂存本次改动

```bash
git add .
```

> 如果你只想提交某几个文件，可以改成：
>
> ```bash
> git add 路径/文件1 路径/文件2
> ```

## 3) 创建提交（commit）

```bash
git commit -m "codex 写的两数之和"
```

## 4) 关联 GitHub 远程仓库（首次需要）

```bash
git remote add origin https://github.com/<你的用户名>/<你的仓库名>.git
```

如果你之前已经加过 remote，会报已存在，这时可先检查：

```bash
git remote -v
```

## 5) 推送到 GitHub

如果你当前分支是 `main`：

```bash
git push -u origin main
```

如果你当前分支不是 `main`（例如 `work`），就推送当前分支：

```bash
git push -u origin $(git branch --show-current)
```

## 6) 验证是否成功

- 打开 GitHub 仓库页面，查看最新提交。
- 看到提交信息 `codex 写的两数之和` 即表示成功。
