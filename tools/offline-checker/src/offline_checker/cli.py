"""Simple CLI used to demonstrate offline/local pip install."""

from __future__ import annotations

import argparse
import datetime as dt


def build_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(
        prog="offline-check",
        description="Print a deterministic message for offline workflow verification.",
    )
    parser.add_argument("--name", default="codex-demo", help="Name shown in output")
    return parser


def main() -> int:
    parser = build_parser()
    args = parser.parse_args()

    now = dt.datetime.now(dt.timezone.utc).strftime("%Y-%m-%dT%H:%M:%SZ")
    print(f"[offline-check] ok name={args.name} time={now}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
