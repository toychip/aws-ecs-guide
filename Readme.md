# ECS 무중단 CI/CD 파이프라인
이 프로젝트는 AWS ECS를 사용하여 무중단 배포를 구현하는 방법을 설명합니다. 

전체 과정은 여러 단계로 나뉘며, 각 단계마다 GitHub Actions를 사용한 CI/CD 파이프라인 구축이 포함됩니다. 

아래는 각 단계에 대한 블로그 글 목록과 관련 코드 설명입니다.

## 블로그 글 목록

[ECS 무중단 CI/CD 파이프라인: 0. ECS 배포하게 된 배경](https://toychip.tistory.com/66)

[ECS 무중단 CI/CD 파이프라인: 1. ECS 기본 개념, ECR, Task 정의, IAM, CLI](https://toychip.tistory.com/67)

[ECS 무중단 CI/CD 파이프라인: 2. Route 53 & ACM 🔥😡🔥](https://toychip.tistory.com/68)

[ECS 무중단 CI/CD 파이프라인: 3. 로드밸런서와 리스너, 대상그룹](https://toychip.tistory.com/69)

[ECS 무중단 CI/CD 파이프라인: 4. ECS Service 배포, HTTP Redirect](https://toychip.tistory.com/70)

[ECS 무중단 CI/CD 파이프라인: 5. GitHub Action CI/CD Pipeline 구축](https://toychip.tistory.com/71)

## 프로젝트 구조

```text
├── aws
│   └── task-definition.json
├── .github
│   └── workflows
│       ├── ci.yml
│       └── cd.yml
├── src
│   └── ...
└── README.md
```

## AWS Task 정의 파일
루트 폴더의 aws 디렉토리에 위치한 task-definition.json 파일은 ECS에서 사용할 태스크 정의를 포함하고 있습니다. 

이 파일은 ECS 클러스터에 배포될 컨테이너의 설정을 정의합니다.

## CI/CD 파일
.github/workflows 디렉토리에는 GitHub Actions를 사용하여 CI/CD 파이프라인을 구축하기 위한 YAML 파일들이 있습니다. 

이 파일들은 다음과 같은 기능을 수행합니다:

### ci.yml

Continuous Integration을 위한 워크플로우 파일입니다. 

코드가 푸시될 때마다 테스트와 빌드를 자동으로 수행합니다.

### cd.yml

Continuous Deployment를 위한 워크플로우 파일입니다. 

특정 브랜치에 푸시되거나 PR이 머지될 때 자동으로 ECS에 배포합니다.

## 사용 방법
### 태스크 정의 파일 수정

aws/task-definition.json 파일에서 컨테이너 이미지, 리소스 설정 등을 수정합니다.

### GitHub Actions 설정
.github/workflows/ci.yml 및 cd.yml 파일에서 필요한 환경 변수를 설정합니다.

## 배포

코드 변경 사항을 푸시하면 GitHub Actions가 자동으로 빌드, 테스트, 배포를 수행합니다.

자세한 내용은 각 블로그 글을 참조해주세요.

## 문의
프로젝트에 대한 질문이나 제안 사항이 있으면 이슈를 등록해 주세요.